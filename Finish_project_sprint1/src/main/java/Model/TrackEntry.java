package Model;

import Util.TrackAciton;

import java.time.LocalDateTime;

public class TrackEntry {
    private LocalDateTime date;
    private Evidenci evidenci;
    private Detective detective;
    private TrackAciton trackAciton;
    private String reason;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Evidenci getEvidenci() {
        return evidenci;
    }

    public void setEvidenci(Evidenci evidenci) {
        this.evidenci = evidenci;
    }

    public Detective getDetective() {
        return detective;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    public TrackAciton getTrackAciton() {
        return trackAciton;
    }

    public void setTrackAciton(TrackAciton trackAciton) {
        this.trackAciton = trackAciton;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
