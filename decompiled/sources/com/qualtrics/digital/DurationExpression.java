package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes5.dex */
class DurationExpression extends Expression {
    private String RightOperand;
    private String TimeType;

    public DurationExpression(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.RightOperand = str4;
        this.TimeType = str5;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:3:0x0003, B:32:0x0098, B:10:0x001e, B:12:0x0026, B:19:0x0051, B:21:0x0066, B:25:0x006e, B:27:0x007a, B:31:0x0082, B:13:0x0030, B:15:0x0038, B:16:0x0041, B:18:0x0049), top: B:36:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:3:0x0003, B:32:0x0098, B:10:0x001e, B:12:0x0026, B:19:0x0051, B:21:0x0066, B:25:0x006e, B:27:0x007a, B:31:0x0082, B:13:0x0030, B:15:0x0038, B:16:0x0041, B:18:0x0049), top: B:36:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:3:0x0003, B:32:0x0098, B:10:0x001e, B:12:0x0026, B:19:0x0051, B:21:0x0066, B:25:0x006e, B:27:0x007a, B:31:0x0082, B:13:0x0030, B:15:0x0038, B:16:0x0041, B:18:0x0049), top: B:36:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:3:0x0003, B:32:0x0098, B:10:0x001e, B:12:0x0026, B:19:0x0051, B:21:0x0066, B:25:0x006e, B:27:0x007a, B:31:0x0082, B:13:0x0030, B:15:0x0038, B:16:0x0041, B:18:0x0049), top: B:36:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0082, please report this as an issue */
    @Override // com.qualtrics.digital.Expression, com.qualtrics.digital.IEvaluable
    public boolean evaluate() {
        double elapsedHours;
        long j;
        try {
            String lowerCase = this.TimeType.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 99469071) {
                if (lowerCase.equals("hours")) {
                    elapsedHours = DurationTimer.instance().getElapsedHours();
                    j = Long.parseLong(this.RightOperand);
                    if (getOperator().equalsIgnoreCase("greaterthan")) {
                        if (elapsedHours - j > 0.0d) {
                            return true;
                        }
                        return false;
                    }
                    if (getOperator().equalsIgnoreCase("lessthan")) {
                        if (elapsedHours - j < 0.0d) {
                            return true;
                        }
                        return false;
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected duration operator: " + getOperator());
                }
                SentryLogcatAdapter.serializer("Qualtrics", "Unexpected duration time metric: " + this.TimeType);
                return false;
            }
            if (iHashCode == 1064901855) {
                if (lowerCase.equals("minutes")) {
                    elapsedHours = DurationTimer.instance().getElapsedMinutes();
                    j = Long.parseLong(this.RightOperand);
                    if (getOperator().equalsIgnoreCase("greaterthan")) {
                        if (elapsedHours - j > 0.0d) {
                            return true;
                        }
                        return false;
                    }
                    if (getOperator().equalsIgnoreCase("lessthan")) {
                        if (elapsedHours - j < 0.0d) {
                            return true;
                        }
                        return false;
                    }
                    SentryLogcatAdapter.serializer("Qualtrics", "Unexpected duration operator: " + getOperator());
                }
                SentryLogcatAdapter.serializer("Qualtrics", "Unexpected duration time metric: " + this.TimeType);
                return false;
            }
            if (iHashCode == 1970096767 && lowerCase.equals("seconds")) {
                elapsedHours = DurationTimer.instance().getElapsedSeconds();
                j = Long.parseLong(this.RightOperand);
                if (getOperator().equalsIgnoreCase("greaterthan")) {
                    if (elapsedHours - j > 0.0d) {
                        return true;
                    }
                    return false;
                }
                if (getOperator().equalsIgnoreCase("lessthan")) {
                    if (elapsedHours - j < 0.0d) {
                        return true;
                    }
                    return false;
                }
                SentryLogcatAdapter.serializer("Qualtrics", "Unexpected duration operator: " + getOperator());
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected duration time metric: " + this.TimeType);
            return false;
        } catch (NumberFormatException unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected duration number format" + this.RightOperand);
        }
        return false;
    }
}
