package o;

import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public interface createImageBitmap {
    default androidx.lifecycle.ViewModel RemoteActionCompatParcelizer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, setStrokeMiterLimit setstrokemiterlimit) {
        return serializer(Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk), setstrokemiterlimit);
    }

    default androidx.lifecycle.ViewModel serializer(Class cls, setStrokeMiterLimit setstrokemiterlimit) {
        return serializer(cls);
    }

    default androidx.lifecycle.ViewModel serializer(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
