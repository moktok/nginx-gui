package be.infernalwhale.load_balancer_backend.service;

import be.infernalwhale.load_balancer_backend.model.BackendServer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackendServerServiceImpl implements BackendServerService {
    @Override
    public List<BackendServer> getServers() {
        return List.of(
                new BackendServer().setId(1).setIp("192.168.0.42").setName("VM01").setDomainName("vm01.maindomain.com"),
                new BackendServer().setId(2).setIp("192.168.0.43").setName("VM02").setDomainName("vm02.maindomain.com"),
                new BackendServer().setId(3).setIp("192.168.0.44").setName("VM03").setDomainName("vm03.maindomain.com")
        );
    }


}
