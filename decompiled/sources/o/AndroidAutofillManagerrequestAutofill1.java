package o;

import com.mapbox.navigation.core.MapboxNavigation;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidAutofillManagerrequestAutofill1 implements androidx.compose.ui.graphics.ColorProducer, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    public final /* synthetic */ MapboxNavigation.AnonymousClass10 serializer;

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // androidx.compose.ui.graphics.ColorProducer
    /* JADX INFO: renamed from: invoke-0d7_KjU */
    public final long mo803invoke0d7_KjU() {
        return ((androidx.compose.ui.graphics.Color) this.serializer.get()).m732unboximpl();
    }

    public AndroidAutofillManagerrequestAutofill1(MapboxNavigation.AnonymousClass10 anonymousClass10) {
        this.serializer = anonymousClass10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof androidx.compose.ui.graphics.ColorProducer) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            return false;
        }
        return this.serializer.equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
    }
}
