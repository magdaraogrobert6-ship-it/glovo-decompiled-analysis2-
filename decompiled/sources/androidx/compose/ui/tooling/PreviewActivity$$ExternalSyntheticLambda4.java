package androidx.compose.ui.tooling;

import o.getBirthDateFull;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class PreviewActivity$$ExternalSyntheticLambda4 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object[] f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda4(String str, String str2, Object[] objArr) {
        this.f$1 = str;
        this.f$2 = str2;
        this.f$0 = objArr;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object[] objArr = this.f$0;
        String str = this.f$2;
        String str2 = this.f$1;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        return i != 0 ? PreviewActivity.setParameterizedContent$lambda$1(str2, str, objArr, getbirthdatefull, iIntValue) : PreviewActivity.setParameterizedContent$lambda$0(objArr, str2, str, getbirthdatefull, iIntValue);
    }

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda4(Object[] objArr, String str, String str2) {
        this.f$0 = objArr;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
