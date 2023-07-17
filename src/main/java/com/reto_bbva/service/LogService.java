package com.reto_bbva.service;
import com.reto_bbva.model.Country;
import com.reto_bbva.model.Log;
import com.reto_bbva.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    private final LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void guardarLog(String searchValue, Country country) {
        String officialName = country != null ? country.getOfficialName() : null;
        String region = country != null ? country.getRegion() : null;
        String subregion = country != null ? country.getSubregion() : null;
        String languages = country != null ? country.getLanguages() : null;
        String currencies = country != null ? country.getCurrencies() : null;
        String coatOfArms = country != null ? country.getCoatOfArms() : null;

        Log log = new Log(searchValue, officialName, region, subregion, languages, currencies, coatOfArms);
        logRepository.save(log);
    }
}
