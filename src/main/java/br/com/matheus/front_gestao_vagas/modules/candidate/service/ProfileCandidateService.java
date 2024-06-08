package br.com.matheus.front_gestao_vagas.modules.candidate.service;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.matheus.front_gestao_vagas.modules.candidate.dto.ProfileUserDTO;

@Service
public class ProfileCandidateService {

    public ProfileUserDTO execute(String token) {
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(headers);

        var result = rt.exchange("http://localhost:8080/candidate/", HttpMethod.GET, request, ProfileUserDTO.class);
        System.out.println(result);
        return result.getBody();
    }
}