<!doctype html><html><head><meta charset=utf8><meta name=viewport content="width=device-width,initial-scale=1,viewport-fit=cover"><style>:root{color-scheme:light;box-sizing:border-box;padding-top:env(safe-area-inset-top,0px);padding-bottom:env(safe-area-inset-bottom,0px)}html{scroll-padding-top:env(safe-area-inset-top,0px)}body{margin:0;padding:0;font:14px -apple-system,BlinkMacSystemFont,sans-serif;background:#fff;color:#000}img{max-width:100%}[hidden]:not([hidden=until-found i]){display:none!important}</style></head><body>
<title>GR+</title>
<meta name="claude:viewport-fit-sides" content="cover">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&family=Space+Grotesk:wght@500;600;700&display=swap">
<style>
  /* Layout: links die Event-Liste, rechts die Teilnehmer des gewählten Events; mobil nacheinander (Liste, dann Detail) */
  :root {
    --bg: #F3F8FF;
    --surface: #FFFFFF;
    --fg: #14213A;
    --muted: #61708C;
    --line: #DDE7F5;
    --accent: #2D6CF0;
    --accent-fg: #FFFFFF;
    --accent-soft: #E3EDFF;
    --danger: #B3261E;
    --k0-bg: #DCEBFF; --k0-fg: #1F56B8;
    --k1-bg: #FFF0B3; --k1-fg: #7A5A00;
    --k2-bg: #D5F5E6; --k2-fg: #1A7A4F;
    --k3-bg: #FFDDE6; --k3-fg: #B02A55;
    --font-display: "Space Grotesk", "Helvetica Neue", Arial, sans-serif;
    --font-body: "Inter", system-ui, -apple-system, "Segoe UI", sans-serif;
  }
  @media (prefers-color-scheme: dark) {
    :root:not([data-theme="light"]) {
      --bg: #0E1626; --surface: #172138; --fg: #EAF0FF; --muted: #9AA9C7; --line: #26324D;
      --accent: #7FB0FF; --accent-fg: #08162E; --accent-soft: #1E2F55; --danger: #FF8A80;
      --k0-bg: #1E3560; --k0-fg: #A9CBFF;
      --k1-bg: #4A3F12; --k1-fg: #FFE27A;
      --k2-bg: #19433A; --k2-fg: #8FE8C0;
      --k3-bg: #55233A; --k3-fg: #FFB3CB;
      color-scheme: dark;
    }
  }
  :root[data-theme="dark"] {
    --bg: #0E1626; --surface: #172138; --fg: #EAF0FF; --muted: #9AA9C7; --line: #26324D;
    --accent: #7FB0FF; --accent-fg: #08162E; --accent-soft: #1E2F55; --danger: #FF8A80;
    --k0-bg: #1E3560; --k0-fg: #A9CBFF;
    --k1-bg: #4A3F12; --k1-fg: #FFE27A;
    --k2-bg: #19433A; --k2-fg: #8FE8C0;
    --k3-bg: #55233A; --k3-fg: #FFB3CB;
    color-scheme: dark;
  }

  * { box-sizing: border-box; }
  body {
    background: var(--bg); color: var(--fg);
    font-family: var(--font-body); font-size: 15px; line-height: 1.5;
    padding-block: 32px 56px;
    padding-left: max(16px, env(safe-area-inset-left, 0px));
    padding-right: max(16px, env(safe-area-inset-right, 0px));
  }
  .wrap { max-width: 1040px; margin: 0 auto; display: flex; flex-direction: column; gap: 28px; }
  h1 { font-family: var(--font-display); font-size: 2rem; line-height: 1.1; letter-spacing: -0.02em; margin: 0; font-weight: 700; }
  h1 span { color: var(--accent); }
  .tag { color: var(--muted); margin: 4px 0 0; }

  .layout { display: grid; grid-template-columns: minmax(0, 2fr) minmax(0, 3fr); gap: 24px; align-items: start; }
  @media (max-width: 760px) {
    .layout { grid-template-columns: minmax(0, 1fr); }
    .layout.has-sel .list-pane { display: none; }
    .layout:not(.has-sel) .detail-pane { display: none; }
  }
  .pane { background: var(--surface); border: 1px solid var(--line); border-radius: 16px; padding: 20px; display: flex; flex-direction: column; gap: 16px; min-width: 0; }
  h2 { font-family: var(--font-display); font-size: 1.1rem; font-weight: 600; margin: 0; letter-spacing: -0.01em; }

  form { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 10px; }
  form .full { grid-column: 1 / -1; }
  @media (max-width: 480px) { form { grid-template-columns: minmax(0, 1fr); } }
  label { display: flex; flex-direction: column; gap: 4px; font-size: 0.75rem; color: var(--muted); letter-spacing: 0.04em; text-transform: uppercase; min-width: 0; }
  input {
    font: inherit; font-size: 0.95rem; color: var(--fg); background: var(--bg);
    border: 1px solid var(--line); border-radius: 10px; padding: 9px 11px; width: 100%; min-width: 0;
    text-transform: none; letter-spacing: 0;
  }
  input:focus-visible, button:focus-visible { outline: 2px solid var(--accent); outline-offset: 2px; }
  button { font: inherit; cursor: pointer; }
  .primary { background: var(--accent); color: var(--accent-fg); border: 0; border-radius: 10px; padding: 10px 14px; font-weight: 600; }
  .primary:hover { filter: brightness(1.08); }
  .inline { display: flex; gap: 8px; }
  .inline input { flex: 1; }
  .inline .primary { flex: none; }

  ul { list-style: none; margin: 0; padding: 0; display: flex; flex-direction: column; gap: 6px; }
  .ev { width: 100%; display: flex; align-items: center; gap: 12px; text-align: left; background: none; color: inherit; border: 1px solid transparent; border-radius: 12px; padding: 8px; }
  .ev:hover { background: var(--bg); }
  .ev[aria-current="true"] { background: var(--accent-soft); border-color: var(--accent); }
  .tile { flex: none; width: 52px; text-align: center; border-radius: 10px; padding: 6px 0; font-family: var(--font-display); line-height: 1.1; background: var(--k0-bg); color: var(--k0-fg); }
  .tile b { display: block; font-size: 1.15rem; font-variant-numeric: tabular-nums; }
  .tile small { font-size: 0.65rem; letter-spacing: 0.08em; text-transform: uppercase; }
  .k1 { background: var(--k1-bg); color: var(--k1-fg); }
  .k2 { background: var(--k2-bg); color: var(--k2-fg); }
  .k3 { background: var(--k3-bg); color: var(--k3-fg); }
  .info { flex: 1; min-width: 0; display: flex; flex-direction: column; }
  .info strong { font-weight: 600; overflow-wrap: anywhere; }
  .info span { color: var(--muted); font-size: 0.85rem; overflow-wrap: anywhere; }
  .when { font-size: 0.78rem !important; font-weight: 500; color: var(--accent) !important; }
  .when.past { color: var(--muted) !important; }
  .chev { color: var(--muted); font-size: 1.2rem; }

  .back { display: none; background: none; border: 0; color: var(--accent); font-weight: 600; padding: 0; align-self: flex-start; }
  @media (max-width: 760px) { .back { display: inline-block; } }
  .dhead { display: flex; align-items: center; gap: 14px; flex-wrap: wrap; }
  .dhead .info { min-width: 160px; }
  .dhead h2 { font-size: 1.35rem; overflow-wrap: anywhere; }
  .del { flex: none; background: none; border: 1px solid transparent; color: var(--muted); border-radius: 10px; padding: 6px 10px; font-size: 0.85rem; }
  .del:hover { color: var(--danger); border-color: var(--line); }
  .sub { display: flex; align-items: baseline; justify-content: space-between; border-top: 1px solid var(--line); padding-top: 16px; }
  .count { color: var(--muted); font-size: 0.85rem; font-variant-numeric: tabular-nums; }
  .person { display: flex; align-items: center; gap: 12px; padding: 6px 0; }
  .avatar { flex: none; width: 36px; height: 36px; border-radius: 50%; display: grid; place-items: center; font-family: var(--font-display); font-weight: 600; font-size: 0.85rem; background: var(--k0-bg); color: var(--k0-fg); }
  .person .info strong { font-weight: 500; }
  .empty { color: var(--muted); margin: 0; }
  .placeholder { min-height: 180px; display: grid; place-items: center; text-align: center; }

  .toast { position: fixed; left: 50%; transform: translateX(-50%); bottom: calc(16px + env(safe-area-inset-bottom, 0px)); background: var(--fg); color: var(--bg); border-radius: 12px; padding: 10px 14px; display: flex; gap: 14px; align-items: center; box-shadow: 0 6px 24px rgba(0,0,0,0.2); max-width: calc(100% - 32px); }
  .toast button { background: none; border: 0; color: inherit; font-weight: 600; padding: 0; text-decoration: underline; }
  footer { color: var(--muted); font-size: 0.8rem; }
</style>

<div class="wrap">
  <header>
    <h1>Eventmanager <span>2.0</span></h1>
    <p class="tag">Wähle ein Event und sieh, wer dabei ist.</p>
  </header>

  <div class="layout" id="layout">
    <section class="pane list-pane" aria-labelledby="hEvents">
      <h2 id="hEvents">Events</h2>
      <form id="eventForm" autocomplete="off">
        <label class="full" for="evTitle">Titel
          <input id="evTitle" required maxlength="80" placeholder="z. B. Weihnachtsfeier">
        </label>
        <label for="evDate">Datum
          <input id="evDate" type="date" required>
        </label>
        <label for="evPlace">Ort
          <input id="evPlace" maxlength="60" placeholder="z. B. Düsseldorf">
        </label>
        <button class="primary full" type="submit">Event erstellen</button>
      </form>
      <ul id="eventList"></ul>
    </section>

    <section class="pane detail-pane" aria-live="polite">
      <p class="empty placeholder" id="placeholder">Wähle links ein Event, um die Teilnehmer zu sehen.</p>
      <div id="detail" hidden style="display:flex;flex-direction:column;gap:16px">
        <div id="detailHead" style="display:flex;flex-direction:column;gap:14px"></div>
        <div class="sub"><h2>Teilnehmer</h2><span class="count" id="count"></span></div>
        <form id="personForm" autocomplete="off" style="display:block">
          <div class="inline">
            <input id="peName" required maxlength="60" placeholder="Name hinzufügen, z. B. Lena Hoffmann" aria-label="Name des Teilnehmers">
            <button class="primary" type="submit">Hinzufügen</button>
          </div>
        </form>
        <ul id="personList"></ul>
      </div>
    </section>
  </div>

  <footer>Beispieldaten zum Start, alles frei löschbar. Die Daten bleiben in diesem Browser gespeichert.</footer>
</div>

<div class="toast" id="toast" hidden><span id="toastText"></span><button id="undoBtn" type="button">Rückgängig</button></div>

<script>
  var KEY = "eventmanager-2-0-gaeste";
  var state = load();
  var selectedId = null, lastDeleted = null, toastTimer = null;

  function uid() { return Math.random().toString(36).slice(2, 9); }
  function iso(n) {
    var d = new Date(); d.setDate(d.getDate() + n);
    return d.getFullYear() + "-" + String(d.getMonth() + 1).padStart(2, "0") + "-" + String(d.getDate()).padStart(2, "0");
  }
  function P(name) { return { id: uid(), name: name }; }
  function seed() {
    return { events: [
      { id: uid(), title: "Spieleabend", date: iso(3), place: "Düsseldorf", people: [P("Lena Hoffmann"), P("Tobias Kern"), P("Aylin Demir")] },
      { id: uid(), title: "Weihnachtsfeier", date: iso(21), place: "Köln", people: [P("Marc Vogel"), P("Lena Hoffmann"), P("Jonas Aydin"), P("Mia Becker")] },
      { id: uid(), title: "Silvesterparty", date: iso(51), place: "Online", people: [P("Tobias Kern")] }
    ] };
  }
  function load() {
    try {
      var raw = localStorage.getItem(KEY);
      if (raw) { var s = JSON.parse(raw); if (s && s.events) return s; }
    } catch (e) {}
    return seed();
  }
  function save() { try { localStorage.setItem(KEY, JSON.stringify(state)); } catch (e) {} }
  function esc(s) { return String(s).replace(/[&<>"']/g, function (c) { return { "&": "&amp;", "<": "&lt;", ">": "&gt;", '"': "&quot;", "'": "&#39;" }[c]; }); }
  function initials(n) { return n.trim().split(/\s+/).slice(0, 2).map(function (p) { return p[0]; }).join("").toUpperCase(); }
  function ci(id) { var s = 0; for (var i = 0; i < id.length; i++) s += id.charCodeAt(i); return s % 4; }
  function plural(n) { return n === 1 ? "1 Teilnehmer" : n + " Teilnehmer"; }
  function sorted() { return state.events.slice().sort(function (a, b) { return a.date < b.date ? -1 : 1; }); }
  function byId(id) { return state.events.find(function (e) { return e.id === id; }); }
  function wide() { return window.matchMedia("(min-width: 761px)").matches; }
  function whenLabel(ds) {
    var t = new Date(); t.setHours(0, 0, 0, 0);
    var diff = Math.round((new Date(ds + "T00:00:00") - t) / 86400000);
    if (diff === 0) return { t: "Heute", past: false };
    if (diff === 1) return { t: "Morgen", past: false };
    if (diff > 1) return { t: "in " + diff + " Tagen", past: false };
    if (diff === -1) return { t: "Gestern", past: true };
    return { t: "vor " + Math.abs(diff) + " Tagen", past: true };
  }
  function tile(e) {
    var d = new Date(e.date + "T00:00:00");
    var mon = d.toLocaleDateString("de-DE", { month: "short" }).replace(".", "");
    return '<span class="tile k' + ci(e.id) + '"><b>' + d.getDate() + '</b><small>' + esc(mon) + '</small></span>';
  }

  function render() {
    var sel = byId(selectedId);
    if (!sel) selectedId = null;
    document.getElementById("layout").classList.toggle("has-sel", !!sel);

    var list = sorted();
    document.getElementById("eventList").innerHTML = list.length ? list.map(function (e) {
      var w = whenLabel(e.date);
      return '<li><button type="button" class="ev" data-open="' + e.id + '" aria-current="' + (e.id === selectedId) + '">' + tile(e) +
        '<span class="info"><strong>' + esc(e.title) + '</strong>' + (e.place ? '<span>' + esc(e.place) + '</span>' : '') +
        '<span class="when' + (w.past ? ' past' : '') + '">' + w.t + ' · ' + plural(e.people.length) + '</span></span><span class="chev" aria-hidden="true">›</span></button></li>';
    }).join("") : '<li><p class="empty">Noch keine Events. Lege oben das erste an.</p></li>';

    document.getElementById("placeholder").hidden = !!sel;
    document.getElementById("detail").hidden = !sel;
    if (!sel) return;

    var w = whenLabel(sel.date);
    document.getElementById("detailHead").innerHTML =
      '<button class="back" id="backBtn" type="button">← Alle Events</button>' +
      '<div class="dhead">' + tile(sel) + '<div class="info"><h2>' + esc(sel.title) + '</h2>' + (sel.place ? '<span>' + esc(sel.place) + '</span>' : '') +
      '<span class="when' + (w.past ? ' past' : '') + '">' + w.t + '</span></div>' +
      '<button class="del" type="button" data-del-event="' + sel.id + '" aria-label="Event ' + esc(sel.title) + ' löschen">Event löschen</button></div>';
    document.getElementById("count").textContent = plural(sel.people.length);
    document.getElementById("personList").innerHTML = sel.people.length ? sel.people.map(function (p) {
      return '<li class="person"><span class="avatar k' + ci(p.id) + '">' + esc(initials(p.name)) + '</span>' +
        '<span class="info"><strong>' + esc(p.name) + '</strong></span>' +
        '<button class="del" type="button" data-del-person="' + p.id + '" aria-label="' + esc(p.name) + ' entfernen">Entfernen</button></li>';
    }).join("") : '<li><p class="empty">Noch niemand eingeladen. Füge oben den ersten Namen hinzu.</p></li>';
  }

  function showToast(text) {
    document.getElementById("toastText").textContent = text;
    document.getElementById("toast").hidden = false;
    clearTimeout(toastTimer);
    toastTimer = setTimeout(function () { document.getElementById("toast").hidden = true; lastDeleted = null; }, 6000);
  }

  document.getElementById("eventForm").addEventListener("submit", function (e) {
    e.preventDefault();
    var title = document.getElementById("evTitle").value.trim();
    var date = document.getElementById("evDate").value;
    if (!title || !date) return;
    var ev = { id: uid(), title: title, date: date, place: document.getElementById("evPlace").value.trim(), people: [] };
    state.events.push(ev); selectedId = ev.id;
    save(); render(); e.target.reset(); document.getElementById("evDate").value = iso(0);
    document.getElementById("peName").focus();
  });

  document.getElementById("personForm").addEventListener("submit", function (e) {
    e.preventDefault();
    var sel = byId(selectedId), name = document.getElementById("peName").value.trim();
    if (!sel || !name) return;
    sel.people.push(P(name));
    save(); render(); e.target.reset(); document.getElementById("peName").focus();
  });

  document.addEventListener("click", function (e) {
    var t = e.target.closest("button"); if (!t) return;
    var sel = byId(selectedId);
    if (t.dataset.open) { selectedId = t.dataset.open; render(); if (!wide()) window.scrollTo(0, 0); }
    else if (t.id === "backBtn") { selectedId = null; render(); }
    else if (t.dataset.delEvent && sel) {
      lastDeleted = { type: "event", item: sel };
      state.events = state.events.filter(function (x) { return x.id !== sel.id; });
      selectedId = wide() && state.events.length ? sorted()[0].id : null;
      save(); render(); showToast("Event gelöscht");
    } else if (t.dataset.delPerson && sel) {
      var p = sel.people.find(function (x) { return x.id === t.dataset.delPerson; });
      sel.people = sel.people.filter(function (x) { return x.id !== t.dataset.delPerson; });
      lastDeleted = { type: "person", eventId: sel.id, item: p };
      save(); render(); showToast("Teilnehmer entfernt");
    } else if (t.id === "undoBtn" && lastDeleted) {
      if (lastDeleted.type === "event") { state.events.push(lastDeleted.item); selectedId = lastDeleted.item.id; }
      else { var ev = byId(lastDeleted.eventId); if (ev) ev.people.push(lastDeleted.item); }
      lastDeleted = null; document.getElementById("toast").hidden = true; save(); render();
    }
  });

  document.getElementById("evDate").value = iso(0);
  if (wide() && state.events.length) selectedId = sorted()[0].id;
  render();
</script>

</body></html>
