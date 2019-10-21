import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IBillingInfo } from 'app/shared/model/billing-info.model';

@Component({
  selector: 'jhi-billing-info-detail',
  templateUrl: './billing-info-detail.component.html'
})
export class BillingInfoDetailComponent implements OnInit {
  billingInfo: IBillingInfo;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ billingInfo }) => {
      this.billingInfo = billingInfo;
    });
  }

  previousState() {
    window.history.back();
  }
}
