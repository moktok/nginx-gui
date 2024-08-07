package be.infernalwhale.load_balancer_backend.service;

import be.infernalwhale.load_balancer_backend.model.BackendServer;

import java.util.List;

public interface BackendServerService {
    List<BackendServer> getServers();

}
