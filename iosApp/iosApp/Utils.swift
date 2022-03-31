//
//  Utils.swift
//  iosApp
//
//  Created by Ricardo Bravo on 31/03/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation

extension DateFormatter {
    static let short: DateFormatter = {
        let formatter = DateFormatter()
        formatter.dateStyle = .none
        formatter.timeStyle = .short
        return formatter
    }()
    static let long: DateFormatter = {
        let formatter = DateFormatter()
        formatter.dateStyle = .long
        formatter.timeStyle = .none
        return formatter
    }()
}
