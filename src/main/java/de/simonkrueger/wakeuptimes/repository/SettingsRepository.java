package de.simonkrueger.wakeuptimes.repository;

import de.simonkrueger.wakeuptimes.model.Settings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SettingsRepository extends CrudRepository<Settings, Long> {

    List<Settings> findBySettingName(@Param("name") String name);
}
