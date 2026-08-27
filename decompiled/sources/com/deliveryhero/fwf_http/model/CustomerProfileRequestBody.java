package com.deliveryhero.fwf_http.model;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.isVerticalSwipeInAllowedDirection;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CustomerProfileRequestBody {
    private final Set<String> profileAttributes;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 1)};

    private final Set<String> component1() {
        return this.profileAttributes;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return CustomerProfileRequestBody$$serializer.INSTANCE;
        }

        public final String encode(Set<String> set) {
            set.getClass();
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            CustomerProfileRequestBody customerProfileRequestBody = new CustomerProfileRequestBody(set);
            isverticalswipeinalloweddirection.getClass();
            return isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(CustomerProfileRequestBody.Companion.serializer(), customerProfileRequestBody);
        }

        private Companion() {
        }
    }

    public int hashCode() {
        return this.profileAttributes.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerProfileRequestBody copy$default(CustomerProfileRequestBody customerProfileRequestBody, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = customerProfileRequestBody.profileAttributes;
        }
        return customerProfileRequestBody.copy(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfileRequestBody)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.profileAttributes, ((CustomerProfileRequestBody) obj).profileAttributes}, getCieXyz.write())).booleanValue();
    }

    @onItemDismisslambda0
    public /* synthetic */ CustomerProfileRequestBody(int i, Set set, onCloseClicked oncloseclicked) {
        if (1 == (i & 1)) {
            this.profileAttributes = set;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, CustomerProfileRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final CustomerProfileRequestBody copy(Set<String> set) {
        set.getClass();
        return new CustomerProfileRequestBody(set);
    }

    public String toString() {
        return "CustomerProfileRequestBody(profileAttributes=" + this.profileAttributes + ")";
    }

    public CustomerProfileRequestBody(Set<String> set) {
        set.getClass();
        this.profileAttributes = set;
    }
}
