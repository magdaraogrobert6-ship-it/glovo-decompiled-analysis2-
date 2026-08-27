package o;

import android.content.Context;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public final class lerpbDIf60 extends setPlacementApproachInProgress {
    public final /* synthetic */ Context IconCompatParcelizer;
    public final /* synthetic */ isSpecifiedFK8aYYsannotations RemoteActionCompatParcelizer;
    public final /* synthetic */ TextPaint read;
    public final /* synthetic */ setPlacementApproachInProgress write;

    @Override // o.setPlacementApproachInProgress
    public final void RemoteActionCompatParcelizer(int i) {
        this.write.RemoteActionCompatParcelizer(i);
    }

    @Override // o.setPlacementApproachInProgress
    public final void serializer(android.graphics.Typeface typeface, boolean z) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, this.read, typeface);
        this.write.serializer(typeface, z);
    }

    public lerpbDIf60(isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations, Context context, TextPaint textPaint, setPlacementApproachInProgress setplacementapproachinprogress) {
        this.RemoteActionCompatParcelizer = isspecifiedfk8ayysannotations;
        this.IconCompatParcelizer = context;
        this.read = textPaint;
        this.write = setplacementapproachinprogress;
    }
}
