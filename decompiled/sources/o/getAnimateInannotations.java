package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "FocusScoreCalculator")
public final class getAnimateInannotations implements IInAppMessage {
    private final parseLonglambda0 IconCompatParcelizer;
    private final setDurationInMilliseconds write;

    @Override // o.IInAppMessage
    public final parseLonglambda0 serializer() {
        return this.IconCompatParcelizer;
    }

    public getAnimateInannotations(parseLonglambda0 parselonglambda0, setDurationInMilliseconds setdurationinmilliseconds) {
        parselonglambda0.getClass();
        setdurationinmilliseconds.getClass();
        this.IconCompatParcelizer = parselonglambda0;
        this.write = setdurationinmilliseconds;
    }

    @Override // o.IInAppMessage
    public final r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k write(long j, String str, long j2) {
        str.getClass();
        getBackgroundColor getbackgroundcolorRemoteActionCompatParcelizer = ImageOnlyCard.RemoteActionCompatParcelizer(this, str, j, j2);
        if (getbackgroundcolorRemoteActionCompatParcelizer == null) {
            return null;
        }
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.FOCUS, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(Math.pow(1.0d - ((getbackgroundcolorRemoteActionCompatParcelizer.serializer() * 3.0d) / getbackgroundcolorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()), 3.0d)));
    }

    @Override // o.IInAppMessage
    public final setDurationInMilliseconds write() {
        return this.write;
    }
}
