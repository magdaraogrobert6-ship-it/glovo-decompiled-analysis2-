package com.google.android.gms.oss.licenses;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.oss_licenses.zzg;
import com.mapbox.maps.plugin.attribution.Attribution;
import java.util.ArrayList;
import java.util.List;
import o.OnPlacedModifier;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo extends ArrayAdapter {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzo(zzp zzpVar, FragmentActivity fragmentActivity) {
        this.IconCompatParcelizer = zzpVar;
        OnPlacedModifier onPlacedModifier = zzpVar.write;
        Resources resources = onPlacedModifier.RemoteActionCompatParcelizer;
        String str = onPlacedModifier.IconCompatParcelizer;
        super(fragmentActivity, resources.getIdentifier("libraries_social_licenses_license", "layout", str), onPlacedModifier.RemoteActionCompatParcelizer.getIdentifier("license", "id", str), new ArrayList());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = this.write;
        Object obj = this.IconCompatParcelizer;
        if (i2 != 0) {
            viewGroup.getClass();
            View view2 = super.getView(i, view, viewGroup);
            view2.getClass();
            Attribution attribution = (Attribution) ((List) obj).get(i);
            TextView textView = (TextView) view2.findViewById(R.id.text1);
            textView.setTextColor(attribution.url.length() == 0 ? -7829368 : textView.getContext().getColor(com.logistics.rider.glovo.R.color.mapbox_blue));
            textView.setText(attribution.title);
            return view2;
        }
        zzp zzpVar = (zzp) obj;
        if (view == null) {
            LayoutInflater layoutInflater = zzpVar.getLayoutInflater();
            OnPlacedModifier onPlacedModifier = zzpVar.write;
            Resources resources = onPlacedModifier.RemoteActionCompatParcelizer;
            view = layoutInflater.inflate((XmlPullParser) resources.getXml(resources.getIdentifier("libraries_social_licenses_license", "layout", onPlacedModifier.IconCompatParcelizer)), viewGroup, false);
        }
        zzg zzgVar = (zzg) getItem(i);
        if (zzgVar != null) {
            OnPlacedModifier onPlacedModifier2 = zzpVar.write;
            ((TextView) view.findViewById(onPlacedModifier2.RemoteActionCompatParcelizer.getIdentifier("license", "id", onPlacedModifier2.IconCompatParcelizer))).setText(zzgVar.serializer);
        }
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(Context context, List list) {
        super(context, com.logistics.rider.glovo.R.layout.mapbox_attribution_list_item, list);
        this.IconCompatParcelizer = list;
    }
}
