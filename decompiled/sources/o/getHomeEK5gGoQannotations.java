package o;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getHomeEK5gGoQannotations {
    public static final Feature read;
    public static final Feature[] serializer;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        Feature feature2 = new Feature("sms_code_browser", 2L);
        Feature feature3 = new Feature("sms_retrieve", 1L);
        Feature feature4 = new Feature("user_consent", 3L);
        read = feature4;
        serializer = new Feature[]{feature, feature2, feature3, feature4, new Feature("missed_call_retriever", 2L), new Feature("missed_call_retriever_user_consent", 1L)};
    }
}
