package de.simonkrueger.wakeuptimes.repository;

import de.simonkrueger.wakeuptimes.model.Preset;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalTime;
import java.util.List;

public interface PresetRepository extends CrudRepository<Preset, Long> {



    List<Preset> findByPresetName(@Param("name") String name);
}
