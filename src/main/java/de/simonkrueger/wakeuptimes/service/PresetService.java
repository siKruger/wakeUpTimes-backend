package de.simonkrueger.wakeuptimes.service;


import de.simonkrueger.wakeuptimes.model.Preset;
import de.simonkrueger.wakeuptimes.repository.PresetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class PresetService {
    @Autowired
    PresetRepository preRepo;


    public List<Preset> getCustomTimes() {
        return preRepo.findByPresetName("singleTime");
    }

    public List<Preset> getHolidayTime() {
        return preRepo.findByPresetName("holiday");
    }

    public List<Preset> getAllPresets() {
        Iterable<Preset> allPresets = preRepo.findAll();
        List<Preset> returnPresets = new ArrayList<>();

        for(Preset singlePreset: allPresets) {
            if(!singlePreset.getPresetName().equals("holiday") && !singlePreset.getPresetName().equals("singleTime")) {
                returnPresets.add(singlePreset);
            }
        }

        return returnPresets;
    }
}
