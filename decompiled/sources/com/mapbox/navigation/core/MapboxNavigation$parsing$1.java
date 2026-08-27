package com.mapbox.navigation.core;

import com.mapbox.navigation.base.route.NavigationRoute;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$parsing$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ createInAppMessageEventSubscriber $routeLookup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxNavigation$parsing$1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, int i) {
        super(1);
        this.$r8$classId = i;
        this.$routeLookup = createinappmessageeventsubscriber;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.$routeLookup;
        if (i != 0) {
            createinappmessageeventsubscriber.IconCompatParcelizer = (Throwable) obj;
            return createFromParcel.INSTANCE;
        }
        String str = (String) obj;
        str.getClass();
        return (NavigationRoute) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) createinappmessageeventsubscriber.IconCompatParcelizer).invoke(str);
    }
}
