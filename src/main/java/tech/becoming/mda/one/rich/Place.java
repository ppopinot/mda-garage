package tech.becoming.mda.one.rich;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
public class Place extends BasicDAO {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @JoinColumn
    private String password;

    public static List<PlaceDTO> findAll() {
        return list()
                .stream()
                .map(Place::toDto)
                .collect(Collectors.toList());
    }

    // @Secured
    public Place save() {
        validate();

        // TODO save in DB;
        super.save(this);

        return this;
    }

    void validate() {
    // TODO
    }

    public PlaceDTO toDto() {
        return PlaceDTO
                .builder()
                .id(this.getId())
                .build();
    }
}
@AllArgsConstructor
@Getter
class NewPlaceDTO {

    private final String password;

    public Place toEntity() {
        return Place
                .builder()
                .password(getPassword())
                .build();
    }
}

@Getter
@Builder
class PlaceDTO extends PlaceController {

    private final Long id;

}