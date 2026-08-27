package o;

import android.content.ContentValues;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ extends r8lambdaSl6HfpkWhWo6LDjCw2JoZqjyIyY {
    private final double IconCompatParcelizer;
    private final SafetyScoreType serializer;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    public final double read() {
        return this.IconCompatParcelizer;
    }

    public final SafetyScoreType serializer() {
        return this.serializer;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> write() {
        return logImpressionlambda3.MediaBrowserCompatMediaItem();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("unique_id", this.RemoteActionCompatParcelizer);
        contentValues.put("type", this.serializer.value);
        contentValues.put("value", Double.valueOf(this.IconCompatParcelizer));
        return contentValues;
    }

    public r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ(String str, SafetyScoreType safetyScoreType, double d) {
        super(str);
        this.serializer = safetyScoreType;
        this.IconCompatParcelizer = d;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SafetyScoresMetadataEntry{uniqueId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', type='");
        sb.append(this.serializer);
        sb.append("', value=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, '}');
    }
}
