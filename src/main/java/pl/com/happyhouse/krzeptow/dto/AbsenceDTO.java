package pl.com.happyhouse.krzeptow.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.com.happyhouse.krzeptow.model.Child;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AbsenceDTO {

    private String dates;
    private List<Child> children = new ArrayList<>();
    private String childrenIds;
    private String nextOccurrence;
    private String description;
    private String startHours;
    private String endHours;

}
