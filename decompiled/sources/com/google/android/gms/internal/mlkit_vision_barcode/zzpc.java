package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import coil3.network.NetworkFetcher;
import com.logistics.rider.glovo.R;
import com.roadrunner.notifications.sounds.api.UnknownSoundMappingException;
import java.util.Locale;
import o.BiasAlignmentVertical;
import o.ContentInViewNode;
import o.InlineChildren;
import o.anchoredDrag;
import o.any;
import o.getInnerui;
import o.getMap;
import o.getOuterui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzpc {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[LOOP:1: B:18:0x0064->B:22:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0076 A[SYNTHETIC] */
    public static final any collectTextContextMenuData(DelegatableNode delegatableNode) {
        Object[] objArr;
        int i;
        int i2;
        int i3 = 2 % 2;
        BiasAlignmentVertical biasAlignmentVertical = new BiasAlignmentVertical();
        TraversableNodeKt.traverseAncestors(delegatableNode, getMap.write, new InlineChildren(new InlineChildren(17, biasAlignmentVertical), 18, new NetworkFetcher.AnonymousClass2(1, biasAlignmentVertical, BiasAlignmentVertical.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 3)));
        ContentInViewNode contentInViewNode = new ContentInViewNode();
        ContentInViewNode contentInViewNode2 = biasAlignmentVertical.write;
        Object[] objArr2 = contentInViewNode2.read;
        int i4 = contentInViewNode2.IconCompatParcelizer;
        getInnerui getinnerui = null;
        int i5 = 0;
        boolean z = true;
        while (true) {
            getOuterui getouterui = getOuterui.write;
            if (i5 >= i4) {
                if (((getInnerui) (contentInViewNode.write() ? null : contentInViewNode.read[contentInViewNode.IconCompatParcelizer - 1])) == getouterui) {
                    int i6 = write + 3;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    contentInViewNode.write(i6 % 2 != 0 ? contentInViewNode.IconCompatParcelizer >>> 1 : contentInViewNode.IconCompatParcelizer - 1);
                }
                anchoredDrag anchoreddrag = contentInViewNode.serializer;
                if (anchoreddrag == null) {
                    anchoreddrag = new anchoredDrag(contentInViewNode);
                    contentInViewNode.serializer = anchoreddrag;
                }
                return new any(anchoreddrag);
            }
            getInnerui getinnerui2 = (getInnerui) objArr2[i5];
            if (z) {
                int i7 = write + 99;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (getinnerui2 != getouterui) {
                    if (getinnerui2 == getouterui || getinnerui != getouterui) {
                        if (getinnerui2 != getouterui) {
                            ContentInViewNode contentInViewNode3 = biasAlignmentVertical.read;
                            objArr = contentInViewNode3.read;
                            i = contentInViewNode3.IconCompatParcelizer;
                            i2 = 0;
                            while (true) {
                                if (i2 < i) {
                                    if (((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objArr[i2]).invoke(getinnerui2)).booleanValue()) {
                                        i2++;
                                    } else {
                                        z = false;
                                    }
                                }
                            }
                        }
                        contentInViewNode.read(getinnerui2);
                        z = false;
                        getinnerui = getinnerui2;
                    } else {
                        z = false;
                    }
                }
            } else if (getinnerui2 == getouterui) {
                if (getinnerui2 != getouterui) {
                    ContentInViewNode contentInViewNode4 = biasAlignmentVertical.read;
                    objArr = contentInViewNode4.read;
                    i = contentInViewNode4.IconCompatParcelizer;
                    i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objArr[i2]).invoke(getinnerui2)).booleanValue()) {
                                z = false;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                contentInViewNode.read(getinnerui2);
                z = false;
                getinnerui = getinnerui2;
            } else {
                if (getinnerui2 != getouterui) {
                    ContentInViewNode contentInViewNode5 = biasAlignmentVertical.read;
                    objArr = contentInViewNode5.read;
                    i = contentInViewNode5.IconCompatParcelizer;
                    i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objArr[i2]).invoke(getinnerui2)).booleanValue()) {
                                z = false;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                contentInViewNode.read(getinnerui2);
                z = false;
                getinnerui = getinnerui2;
            }
            i5++;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int serializer(int i, String str) {
        int i2 = 2 % 2;
        str.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1847036555:
                if (lowerCase.equals("quite_impressed")) {
                    return R.raw.quite_impressed;
                }
                break;
            case -1823298381:
                if (lowerCase.equals("low_prio")) {
                    return R.raw.low_prio;
                }
                break;
            case -1761007328:
                if (lowerCase.equals("the_ride_of_my_life")) {
                    return R.raw.the_ride_of_my_life;
                }
                break;
            case -1544000461:
                if (lowerCase.equals("talabat")) {
                    return R.raw.talabat;
                }
                break;
            case -956815353:
                if (lowerCase.equals("joy_long")) {
                    int i3 = write + 11;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        return R.raw.joy_long;
                    }
                    throw null;
                }
                break;
            case -928658540:
                if (lowerCase.equals("annoying_alert")) {
                    return R.raw.annoying_alert;
                }
                break;
            case -692997339:
                if (lowerCase.equals("high_prio")) {
                    return R.raw.high_prio;
                }
                break;
            case -237954202:
                if (lowerCase.equals("attention_seeker")) {
                    return R.raw.attention_seeker;
                }
                break;
            case 105428:
                if (lowerCase.equals("joy")) {
                    return R.raw.joy;
                }
                break;
            case 113316257:
                if (lowerCase.equals("woowa")) {
                    return R.raw.woowa;
                }
                break;
            case 1745660127:
                if (lowerCase.equals("oringz_w437_339")) {
                    return R.raw.oringz_w437_339;
                }
                int i4 = write + 125;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                }
                break;
        }
        Timber.RemoteActionCompatParcelizer.write(new UnknownSoundMappingException("Unknown sound mapping for ".concat(str)));
        return i;
    }
}
