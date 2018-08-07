public class Email {
    private String To;
    private String Subject;
    private String CC;
    private String Body;
    private int Priority;
    private boolean Attachment;

    @Override
    public String toString() {
        return "Email{" +
                "To='" + To + '\'' +
                ", Subject='" + Subject + '\'' +
                ", CC='" + CC + '\'' +
                ", Body='" + Body + '\'' +
                ", Priority=" + Priority +
                ", Attachment=" + Attachment +
                '}';
    }

    public static class Builder {
        private final String To;
        private final String Subject;
        private String CC;
        private String Body;
        private int Priority;
        private boolean Attachment = false;

        public Builder() {
            this.To = "to";
            this.Subject = "subject";
        }

        public Builder withAttachment() {
            Attachment = true;
            return this;
        }

        public Builder withCC() {
            CC = "CC";
            return this;
        }

        public Builder withPriority() {
            Priority = 3;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }

    private Email(Builder builder) {
        To = builder.To;
        Subject = builder.Subject;
        CC = builder.CC;
        Body = builder.Body;
        Priority = builder.Priority;
        Attachment = builder.Attachment;
    }
}

