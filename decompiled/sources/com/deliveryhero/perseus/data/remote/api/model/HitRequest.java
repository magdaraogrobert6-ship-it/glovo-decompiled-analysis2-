package com.deliveryhero.perseus.data.remote.api.model;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.perseus.Consent;
import com.deliveryhero.perseus.data.local.db.entity.EcommerceComponent;
import com.deliveryhero.perseus.data.local.db.entity.EcommerceItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class HitRequest extends HitDetails {
    public /* synthetic */ HitRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Consent consent, Long l, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Map map, List list, List list2, boolean z, String str24, String str25, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, (i & Fields.CompositingStrategy) != 0 ? null : str16, (i & 65536) != 0 ? null : consent, (i & Fields.RenderEffect) != 0 ? null : l, str17, str18, str19, str20, str21, str22, str23, map, (i & 67108864) != 0 ? null : list, (i & 134217728) != 0 ? null : list2, z, (i & 536870912) != 0 ? "" : str24, (i & 1073741824) != 0 ? "" : str25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HitRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Consent consent, Long l, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Map<String, String> map, List<EcommerceItem> list, List<EcommerceComponent> list2, boolean z, String str24, String str25) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, consent, l, str17, str18, str19, str20, str21, str22, str23, map, list, list2, z, str24, null, str25, null, 1073741824, 1, null);
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str6);
        m1$$ExternalSyntheticOutline0.m(str7, str8, str10, str11, str13);
        m1$$ExternalSyntheticOutline0.m(str14, str15, str17, str18, str19);
        str20.getClass();
        str21.getClass();
        str22.getClass();
        str23.getClass();
        map.getClass();
        str25.getClass();
    }
}
