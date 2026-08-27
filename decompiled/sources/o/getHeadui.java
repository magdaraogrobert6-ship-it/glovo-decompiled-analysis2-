package o;

/* JADX INFO: loaded from: classes2.dex */
public @interface getHeadui {

    public enum IconCompatParcelizer {
        DEFAULT,
        SIGNED,
        FIXED
    }

    int RemoteActionCompatParcelizer();

    IconCompatParcelizer serializer() default IconCompatParcelizer.DEFAULT;
}
