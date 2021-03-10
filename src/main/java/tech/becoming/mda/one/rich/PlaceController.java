package tech.becoming.mda.one.rich;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "places")
@RequiredArgsConstructor
public class PlaceController {

    @GetMapping
    // @Secured
    public List<PlaceDTO> findAllPlace() {
        return Place.findAll();
    }

    @PostMapping
    public PlaceDTO createPlace(NewPlaceDTO place) {
        return place
                .toEntity()
                .save()
                .toDto();
    }

}
