package br.com.assiseliton.regesc.utlity;

import org.springframework.stereotype.Component;

@Component
public class ResponseMensage {
    private  String response;
    private String status;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
