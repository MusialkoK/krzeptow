package pl.com.happyhouse.krzeptow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.happyhouse.krzeptow.model.DayCareStrategy;

import java.util.Optional;

@Repository
public interface DayCareStrategyRepository extends JpaRepository<DayCareStrategy, Long> {

    Optional<DayCareStrategy> getById(Long id);

}
