package o;

/* JADX INFO: loaded from: classes4.dex */
public enum SetPushNotificationSubscriptionStep implements r8lambdakdT06ZZBT3HezLLCifuU7PvlmY {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    @Override // o.r8lambdakdT06ZZBT3HezLLCifuU7PvlmY
    public String apiName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }
}
