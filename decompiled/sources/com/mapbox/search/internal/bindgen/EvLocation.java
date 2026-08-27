package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes3.dex */
public class EvLocation implements Serializable {
    private final Boolean chargingWhenClosed;
    private final EnergyMix energyMix;
    private final List<EVSE> evses;
    private final BusinessDetails operatorDetails;
    private final BusinessDetails ownerDetails;
    private final String partyId;
    private final boolean publish;
    private final List<EvsePublishTokenType> publishAllowedTo;
    private final List<AdditionalCpoGeoLocation> relatedLocations;
    private final BusinessDetails suboperatorDetails;

    public Boolean getChargingWhenClosed() {
        return this.chargingWhenClosed;
    }

    public EnergyMix getEnergyMix() {
        return this.energyMix;
    }

    public List<EVSE> getEvses() {
        return this.evses;
    }

    public BusinessDetails getOperatorDetails() {
        return this.operatorDetails;
    }

    public BusinessDetails getOwnerDetails() {
        return this.ownerDetails;
    }

    public String getPartyId() {
        return this.partyId;
    }

    public boolean getPublish() {
        return this.publish;
    }

    public List<EvsePublishTokenType> getPublishAllowedTo() {
        return this.publishAllowedTo;
    }

    public List<AdditionalCpoGeoLocation> getRelatedLocations() {
        return this.relatedLocations;
    }

    public BusinessDetails getSuboperatorDetails() {
        return this.suboperatorDetails;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.partyId;
        boolean z = this.publish;
        return Objects.hash(str, Boolean.valueOf(z), this.publishAllowedTo, this.relatedLocations, this.evses, this.operatorDetails, this.suboperatorDetails, this.ownerDetails, this.chargingWhenClosed, this.energyMix);
    }

    public EvLocation(String str, boolean z, List<EvsePublishTokenType> list, List<AdditionalCpoGeoLocation> list2, List<EVSE> list3, BusinessDetails businessDetails, BusinessDetails businessDetails2, BusinessDetails businessDetails3, Boolean bool, EnergyMix energyMix) {
        this.partyId = str;
        this.publish = z;
        this.publishAllowedTo = list;
        this.relatedLocations = list2;
        this.evses = list3;
        this.operatorDetails = businessDetails;
        this.suboperatorDetails = businessDetails2;
        this.ownerDetails = businessDetails3;
        this.chargingWhenClosed = bool;
        this.energyMix = energyMix;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[partyId: ");
        IconCompatParcelizer.read(sb, this.partyId, ", publish: ");
        MediaSessionCompatQueueItem.write(sb, this.publish, ", publishAllowedTo: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.publishAllowedTo, ", relatedLocations: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.relatedLocations, ", evses: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.evses, ", operatorDetails: ");
        sb.append(RecordUtils.fieldToString(this.operatorDetails));
        sb.append(", suboperatorDetails: ");
        sb.append(RecordUtils.fieldToString(this.suboperatorDetails));
        sb.append(", ownerDetails: ");
        sb.append(RecordUtils.fieldToString(this.ownerDetails));
        sb.append(", chargingWhenClosed: ");
        getBitmapFromCache.write(sb, ", energyMix: ", this.chargingWhenClosed);
        sb.append(RecordUtils.fieldToString(this.energyMix));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvLocation evLocation = (EvLocation) obj;
        return Objects.equals(this.partyId, evLocation.partyId) && this.publish == evLocation.publish && Objects.equals(this.publishAllowedTo, evLocation.publishAllowedTo) && Objects.equals(this.relatedLocations, evLocation.relatedLocations) && Objects.equals(this.evses, evLocation.evses) && Objects.equals(this.operatorDetails, evLocation.operatorDetails) && Objects.equals(this.suboperatorDetails, evLocation.suboperatorDetails) && Objects.equals(this.ownerDetails, evLocation.ownerDetails) && Objects.equals(this.chargingWhenClosed, evLocation.chargingWhenClosed) && Objects.equals(this.energyMix, evLocation.energyMix);
    }
}
