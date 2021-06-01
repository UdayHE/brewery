package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by udayhegde
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Beer {
    private String id;
    private String name;
    private String style;
    /**
     * Universal Product Code
     */
    private String upc;
}
