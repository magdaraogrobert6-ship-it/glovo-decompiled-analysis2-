package o;

import kotlin.math.MathKt;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public class setFromtUYjHk implements createImageBitmap {
    public static setFromtUYjHk RemoteActionCompatParcelizer;

    @Override // o.createImageBitmap
    public final androidx.lifecycle.ViewModel RemoteActionCompatParcelizer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, setStrokeMiterLimit setstrokemiterlimit) {
        return serializer(Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk), setstrokemiterlimit);
    }

    @Override // o.createImageBitmap
    public androidx.lifecycle.ViewModel serializer(Class cls, setStrokeMiterLimit setstrokemiterlimit) {
        return serializer(cls);
    }

    @Override // o.createImageBitmap
    public androidx.lifecycle.ViewModel serializer(Class cls) {
        return (androidx.lifecycle.ViewModel) MathKt.RemoteActionCompatParcelizer(new Object[]{cls}, extractAuthorizationHeader.write(), -430013990, 430013990, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write());
    }
}
