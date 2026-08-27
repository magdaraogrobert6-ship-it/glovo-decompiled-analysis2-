package o;

/* JADX INFO: loaded from: classes4.dex */
public interface DefaultInAppMessageViewWrapperFactory {
    void IconCompatParcelizer();

    void IconCompatParcelizer(String str);

    prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem();

    DefaultInAppMessageViewWrapperFactory RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda);

    void RemoteActionCompatParcelizer(byte b);

    void RemoteActionCompatParcelizer(char c);

    void RemoteActionCompatParcelizer(double d);

    void RemoteActionCompatParcelizer(boolean z);

    void read(float f);

    void read(int i);

    void read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i);

    void read(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj);

    void read(short s);

    DefaultInAppMessageSlideupViewFactory serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda);

    void serializer(long j);

    DefaultInAppMessageSlideupViewFactory write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i);

    default void write(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        setgraphicmodalmaxwidthdp.getClass();
        if (setgraphicmodalmaxwidthdp.getDescriptor().MediaBrowserCompatMediaItem()) {
            read(setgraphicmodalmaxwidthdp, obj);
        } else if (obj == null) {
            IconCompatParcelizer();
        } else {
            read(setgraphicmodalmaxwidthdp, obj);
        }
    }
}
