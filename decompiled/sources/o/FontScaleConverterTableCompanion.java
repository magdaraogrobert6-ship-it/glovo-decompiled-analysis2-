package o;

import com.roadrunner.nafath.NafathModalUiModelImpl$startCountDown$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FontScaleConverterTableCompanion extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ NafathModalUiModelImpl$startCountDown$2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontScaleConverterTableCompanion(NafathModalUiModelImpl$startCountDown$2 nafathModalUiModelImpl$startCountDown$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = nafathModalUiModelImpl$startCountDown$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = write + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
            int i3 = 42 / 0;
        } else {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        }
        int i4 = serializer + 105;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
