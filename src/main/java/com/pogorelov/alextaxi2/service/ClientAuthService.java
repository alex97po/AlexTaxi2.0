package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.Client;

public interface ClientAuthService {
    boolean auth (String login, String password);
}
