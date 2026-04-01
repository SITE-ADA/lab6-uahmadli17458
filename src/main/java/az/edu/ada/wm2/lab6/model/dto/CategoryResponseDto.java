package az.edu.ada.wm2.lab6.model.dto;

import lombok.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryResponseDto {
    private UUID id;
    private String name;
}