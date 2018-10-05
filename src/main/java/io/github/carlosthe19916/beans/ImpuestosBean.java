package io.github.carlosthe19916.beans;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ImpuestosBean {

    @NotNull
    private BigDecimal igv;
    private BigDecimal isc;
    private BigDecimal otros;

    public ImpuestosBean() {
    }

    public ImpuestosBean(ImpuestosBean impuestos) {
        igv = impuestos.igv;
        isc = impuestos.isc;
        otros = impuestos.otros;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getIsc() {
        return isc;
    }

    public void setIsc(BigDecimal isc) {
        this.isc = isc;
    }

    public BigDecimal getOtros() {
        return otros;
    }

    public void setOtros(BigDecimal otros) {
        this.otros = otros;
    }
}
