package o;

/* JADX INFO: loaded from: classes4.dex */
public final class defaultCardHandling extends r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 {
    public static final io.sentry.protocol.ensureViewModelStore r8lambda54BeH8ZsBru0CXI2CCSP2syNys = io.sentry.protocol.ensureViewModelStore.CUSTOM;
    public io.sentry.protocol.ensureViewModelStore ResultReceiver;
    public String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public _get_messageWebView_lambda0 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    public defaultCardHandling(String str, io.sentry.protocol.ensureViewModelStore ensureviewmodelstore, String str2, _get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        super(new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(), new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(), str2, null);
        setNativeShader.read(str, "name is required");
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str;
        this.ResultReceiver = ensureviewmodelstore;
        IconCompatParcelizer(_get_messagewebview_lambda0);
        this.read = removeNodeAtDepth.write(null, _get_messagewebview_lambda0 == null ? null : (Boolean) _get_messagewebview_lambda0.write, _get_messagewebview_lambda0 == null ? null : (Double) _get_messagewebview_lambda0.RemoteActionCompatParcelizer, _get_messagewebview_lambda0 == null ? null : (Double) _get_messagewebview_lambda0.serializer);
    }

    public static defaultCardHandling read(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        _get_messageWebView_lambda0 _get_messagewebview_lambda1;
        Boolean bool = (Boolean) _get_messagewebview_lambda0.IconCompatParcelizer;
        getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0 = (getIntentArrayWithConfiguredBackStacklambda0) _get_messagewebview_lambda0.read;
        Double d = getintentarraywithconfiguredbackstacklambda0.MediaSessionCompatQueueItem;
        if (bool == null) {
            _get_messagewebview_lambda1 = null;
        } else {
            Double d2 = getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat;
            _get_messagewebview_lambda1 = new _get_messageWebView_lambda0(bool, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
        }
        defaultCardHandling defaultcardhandling = new defaultCardHandling((io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) _get_messagewebview_lambda0.write, (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) _get_messagewebview_lambda0.RemoteActionCompatParcelizer, "default", (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) _get_messagewebview_lambda0.serializer);
        defaultcardhandling.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = "<unlabeled transaction>";
        defaultcardhandling.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = _get_messagewebview_lambda1;
        defaultcardhandling.ResultReceiver = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        defaultcardhandling.read = removeNodeAtDepth.write(getintentarraywithconfiguredbackstacklambda0, _get_messagewebview_lambda1 == null ? null : (Boolean) _get_messagewebview_lambda1.write, _get_messagewebview_lambda1 == null ? null : (Double) _get_messagewebview_lambda1.RemoteActionCompatParcelizer, _get_messagewebview_lambda1 != null ? (Double) _get_messagewebview_lambda1.serializer : null);
        return defaultcardhandling;
    }

    public defaultCardHandling(String str, String str2) {
        this(str, io.sentry.protocol.ensureViewModelStore.CUSTOM, str2, (_get_messageWebView_lambda0) null);
    }

    public defaultCardHandling(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k, String str, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2) {
        super(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdayq9qbmke5in5qopvpj_kuggks_k, str, r8lambdayq9qbmke5in5qopvpj_kuggks_k2);
    }
}
