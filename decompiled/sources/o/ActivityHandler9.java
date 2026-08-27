package o;

import android.net.Uri;
import com.roadrunner.rider.recruitment.applicant.domain.AddRiderHiringQueryParamsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler9 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ AddRiderHiringQueryParamsImpl IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public Uri.Builder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHandler9(AddRiderHiringQueryParamsImpl addRiderHiringQueryParamsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = addRiderHiringQueryParamsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.invoke(null, this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.invoke(null, this);
        obj2.hashCode();
        throw null;
    }
}
