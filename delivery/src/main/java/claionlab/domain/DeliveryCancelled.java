package claionlab.domain;

import claionlab.domain.*;
import claionlab.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long productId;
    private Long orderId;
    private Integer qty;
    private String status;

    public DeliveryCancelled() {
        super();
    }
}
