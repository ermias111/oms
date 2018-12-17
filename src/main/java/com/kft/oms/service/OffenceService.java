package com.kft.oms.service;

import com.kft.crud.domain.OffenderEntity;
import com.kft.crud.service.CrudService;
import com.kft.oms.domain.Offence;
import com.kft.oms.model.OffenceModel;
import com.kft.oms.repository.OffenceRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface OffenceService extends CrudService<Offence,Integer,OffenceRepository> {

    List<Offence> getAllOffencesByOffenderBetween(OffenderEntity offenderEntity, LocalDate startingDate, LocalDate endDate);
    Integer calculatePenaltyAmount(Offence offence);

    List<OffenceModel> getAllAsOffenceModel();
    Optional<OffenceModel> findOffenceModelById(Integer id);
    OffenceModel save(OffenceModel offenceModel);
}
