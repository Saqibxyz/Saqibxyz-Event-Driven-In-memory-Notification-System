package notification.event;

public class ReminderEvent extends CustomEvent {
    /**
     * @param details      Details about the event
     * @param highPriority Whether event has high priority or not
     */
    public ReminderEvent(String details, boolean highPriority) {
        super(details, highPriority);
    }

    @Override
    public String getType() {
        return "ReminderEvent";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return obj.getClass().getSimpleName().equals("ReminderEvent");
    }

    @Override
    public int hashCode() {
        return getType().hashCode();
    }
}
