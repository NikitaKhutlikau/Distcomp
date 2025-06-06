package by.yelkin.TopicService.dto.topic;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class TopicRq {
    @NotNull(message = "CreatorId must not be null")
    private Long creatorId;

    @NotBlank(message = "Title must not be blank")
    @Size(min = 2, max = 64, message = "Title size must be between 2 and 64 chars")
    private String title;

    @NotBlank(message = "Content must not be blank")
    @Size(min = 4, max = 2048, message = "Content size must be between 4 and 2048 chars")
    private String content;

    @JsonDeserialize(as = ArrayList.class)
    private List<@Size(min = 2, max = 32, message = "Mark name size must be between 2 and 64 chars") String> marks;
}
