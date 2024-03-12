package com.example.muahexanh_resigtration.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CommunityLeaderDTO extends UserDTO {
    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

}
