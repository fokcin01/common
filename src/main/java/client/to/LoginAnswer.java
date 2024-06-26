package client.to;

import java.io.Serializable;

public class LoginAnswer implements Serializable {
    private String answer;
    private Integer loggerUserId;

    public LoginAnswer() {
    }

    public LoginAnswer(String answer, Integer loggerUserId) {
        this.answer = answer;
        this.loggerUserId = loggerUserId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getLoggerUserId() {
        return loggerUserId;
    }

    public void setLoggerUserId(Integer loggerUserId) {
        this.loggerUserId = loggerUserId;
    }
}
