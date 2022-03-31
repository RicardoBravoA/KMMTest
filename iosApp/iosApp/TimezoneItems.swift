//
//  TimezoneItems.swift
//  iosApp
//
//  Created by Ricardo Bravo on 31/03/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI
import shared

class TimezoneItems: ObservableObject {
  @Published var timezones: [String] = []
  @Published var selectedTimezones = Set<String>()

  init() {
      self.timezones = TimeZoneHelperImpl().getTimeZoneStrings()
  }
}
