package Entities;

import java.sql.Timestamp;

public class ZoneB {
    private String Summary;
    private Timestamp Start;
    private Timestamp End;
    private String Description;

    public ZoneB(String summary, Timestamp start, Timestamp end, String description){
        this.Summary = summary;
        this.Start = start;
        this.End = end;
        this.Description = description;
    }

    public String getSummary() {
        return Summary;
    }

    public Timestamp getStart() {
        return Start;
    }

    public Timestamp getEnd() {
        return End;
    }

    public String getDescription() {
        return Description;
    }
}
