package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProtoErrorMsgCompanion {
    public static final getChangeVersionControl IconCompatParcelizer;
    public static final getVariationdefault RemoteActionCompatParcelizer;
    public static final getChangeVersionControl write;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            RemoteActionCompatParcelizer = null;
            write = new getChangeVersionControl(0);
            IconCompatParcelizer = new getChangeVersionControl(3);
        } else if (property.equals("Dalvik")) {
            RemoteActionCompatParcelizer = new getVariationdefault();
            write = new getAsFeature(0);
            IconCompatParcelizer = new FwFClientExtensionKtcreate1(3);
        } else {
            RemoteActionCompatParcelizer = null;
            write = new getDefaultRule();
            IconCompatParcelizer = new FwFClientExtensionKtcreate1(3);
        }
    }
}
