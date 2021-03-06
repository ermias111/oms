package com.kft.oms.service;

import com.kft.crud.domain.OffenderEntity;
import com.kft.crud.service.CrudService;
import com.kft.oms.constants.OffenderType;
import com.kft.oms.domain.Offence;
import com.kft.oms.model.OffenceModel;
import com.kft.oms.repository.OffenceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface OffenceService extends CrudService<Offence,Integer,OffenceRepository> {

    List<Offence> getAllOffencesByOffenderBetween(OffenderEntity offenderEntity, LocalDate startingDate, LocalDate endDate);
    Integer calculatePenaltyAmount(Offence offence);
    OffenderType determineOffender(Offence offence);

    Page<OffenceModel> getAllAsOffenceModel(Pageable pageable);
    Optional<OffenceModel> findOffenceModelById(Integer id);
    OffenceModel save(OffenceModel offenceModel);
    List<OffenceModel> getAllOffencesByOffenderIdAndDateBetween(Integer id, LocalDate startDate, LocalDate endDate);
    Page<OffenceModel> getAllOffencesByOffenderId(Integer id, Pageable pageable);
    Page<OffenceModel> getAllOffencesByOffenderIdAndOffenceCodeId(Integer offenderId, Integer offenceCodeId, Pageable pageable);
    List<OffenceModel> getRecordOffencesForOffenceAndOffenceCode(Integer offenceId, Integer offenceCodeId);
    OffenceModel clearStatus(Integer offenceId);
    Map<Integer,Integer> getOffenceCodeRepetitionForOffenceInRecordKeepingTimeSpan(Integer offenceId);
    Page<OffenceModel> findOffenceByTicketNo(String ticketNo, Pageable pageable);
}
