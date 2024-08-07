package be.infernalwhale.load_balancer_backend.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BackendServer {
    private int id;
    private String name;
    private String domainName;
    private String ip;

}
