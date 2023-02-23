package Entities;

import java.util.Date;

public class JoursFeries {
    private Date Start;
    private String Summary;

    public JoursFeries(Date date, String summary) {
        this.Start = date;
        this.Summary = summary;
    }


    public Date getStart() {
        return Start;
    }
    public String getSummary() {
        return Summary;
    }
}
