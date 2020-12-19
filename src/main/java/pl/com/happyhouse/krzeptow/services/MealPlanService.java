package pl.com.happyhouse.krzeptow.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.happyhouse.krzeptow.model.MealPlan;
import pl.com.happyhouse.krzeptow.repository.MealPlanRepository;

@Service
@AllArgsConstructor
public class MealPlanService {

    private final MealPlanRepository mealPlanRepository;

    public MealPlan save(MealPlan mealPlan){
        return mealPlanRepository.save(mealPlan);
    }


}
